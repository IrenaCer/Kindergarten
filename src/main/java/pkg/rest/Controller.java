package pkg.rest;

        import pkg.dao.ChildDAO;
        import pkg.entities.Child;

        import javax.enterprise.context.ApplicationScoped;
        import javax.inject.Inject;
        import javax.persistence.EntityManager;
        import javax.transaction.Transactional;
        import javax.ws.rs.*;
        import javax.ws.rs.core.MediaType;
        import javax.ws.rs.core.Response;

@ApplicationScoped
@Path("/child")
@Produces(MediaType.APPLICATION_JSON)
public class Controller {

    @Inject
    private ChildDAO childDAO;

    @GET
    @Path("/{childId}")
    public Child find(@PathParam("childId") Integer id) {
        return childDAO.getById(id);
    }

    @Path("/create")
    @PUT
    @Transactional
    public Child create(
            @QueryParam("firstName") String firstName,
            @QueryParam("lastName") String lastName){
        Child child = new Child();
        child.setFirstName(firstName);
        child.setLastName(lastName);
        child.setOptLockVersion(1);
        childDAO.create(child);
        return child;
    }

    @Path("/update/{id}")
    @POST @Transactional
    public Response update(@PathParam("id") Integer id,
                           @QueryParam("firstName") String firstName,
                           @QueryParam("lastName") String lastName) {
        Child child = childDAO.getById(id);
        if (child == null) {
            throw new IllegalArgumentException("child id "
                    + id + " not found");
        }
        child.setFirstName(firstName);
        child.setLastName(lastName);
        childDAO.updateAndFlush(child);
        return Response.ok(child).build();
    }


}