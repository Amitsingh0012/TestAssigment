package com.amit.TodoList.repository;

import com.amit.TodoList.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ITodoRepo extends JpaRepository<Todo,Integer> {
}
