package br.com.henriquebastos.todolist.user;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Modificador
 * public
 * private
 * protected
 */
@RestController
@RequestMapping("/users")
public class UserController {
    

    /**
     * String (texto)
     * Integer (int) numeros inteiros
     * Double (double) Números 0.0000
     * Float (float) Números 0.000
     * char (caracter) A C
     * Date (data)
     * void (não retorna nenhum valor)
     */
    /*
     * Body
     */
    @PostMapping("/")
    public void create(@RequestBody UserModel UserModel) {
        System.out.println(UserModel.name);
    }
}
