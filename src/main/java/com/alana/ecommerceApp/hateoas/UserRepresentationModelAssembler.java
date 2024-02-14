package com.alana.ecommerceApp.hateoas;

import static java.util.stream.Collectors.toList;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

import com.alana.ecommerceApp.controller.CustomerController;
import com.alana.ecommerceApp.entity.UserEntity;
import com.alana.ecommerceApp.model.User;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.StreamSupport;
import org.springframework.beans.BeanUtils;
import org.springframework.hateoas.server.mvc.RepresentationModelAssemblerSupport;
import org.springframework.stereotype.Component;

/**
 * @author : Joshua Alana
 **/
@Component
public class UserRepresentationModelAssembler extends
        RepresentationModelAssemblerSupport<UserEntity, User> {

    /**
     * Creates a new {@link RepresentationModelAssemblerSupport} using the given controller class and
     * resource type.
     */
    public UserRepresentationModelAssembler() {
        super(CustomerController.class, User.class);
    }

    /**
     * Coverts the User entity to resource
     *
     * @param entity
     */
    @Override
    public User toModel(UserEntity entity) {
        User resource = createModelWithId(entity.getId(), entity);
        BeanUtils.copyProperties(entity, resource);
        resource.setId(entity.getId().toString());
        // Self link generated by createModelWithId has missing api path. Therefore generating additionally.
        // can be removed once fixed.
        resource.add(
                linkTo(methodOn(CustomerController.class).getCustomerById(entity.getId().toString()))
                        .withSelfRel());
        resource.add(
                linkTo(methodOn(CustomerController.class).getAllCustomers()).withRel("customers"));
        resource
                .add(
                        linkTo(methodOn(CustomerController.class)
                                .getAddressesByCustomerId(entity.getId().toString())).withRel("self_addresses"));
        return resource;
    }

    /**
     * Coverts the collection of Product entities to list of resources.
     *
     * @param entities
     */
    public List<User> toListModel(Iterable<UserEntity> entities) {
        if (Objects.isNull(entities)) {
            return Collections.emptyList();
        }
        return StreamSupport.stream(entities.spliterator(), false).map(e -> toModel(e))
                .collect(toList());
    }

}