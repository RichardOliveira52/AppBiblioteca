package com.biblioteca.repositories;

import com.biblioteca.domains.Editora;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EditoraRepository extends JpaRepository<Editora,Integer> {
}
