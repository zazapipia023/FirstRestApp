package ru.zaza.firstrestapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.zaza.firstrestapp.models.Person;

@Repository
public interface PeopleRepository extends JpaRepository<Person, Integer> {
}
