package com.elton.aula.projeto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "",method = RequestMethod.GET)
    public List<Usuario> findAll() {
        return  userRepository.findAll();
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public Usuario save(@RequestBody Usuario usuario) {
         return userRepository.save(usuario);
    }

    @RequestMapping(value = "", method = RequestMethod.PUT)
    public Usuario update(@RequestBody Usuario usuario) {
        return userRepository.save(usuario);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Long id) {
         userRepository.deleteById(id);
    }

}