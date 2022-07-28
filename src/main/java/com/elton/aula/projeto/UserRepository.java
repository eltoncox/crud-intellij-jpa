package com.elton.aula.projeto;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<Usuario, Long> {


}
