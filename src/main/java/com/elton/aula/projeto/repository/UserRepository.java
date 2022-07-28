package com.elton.aula.projeto.repository;

import com.elton.aula.projeto.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<Usuario, Long> {


}
