package com.Sofka.CRUD.Repository;

import com.Sofka.CRUD.Model.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Long> {

}
