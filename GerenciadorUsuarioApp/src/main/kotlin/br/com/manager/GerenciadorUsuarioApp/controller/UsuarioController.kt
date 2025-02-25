package br.com.manager.GerenciadorUsuarioApp.controller

import br.com.manager.GerenciadorUsuarioApp.model.Usuario
import br.com.manager.GerenciadorUsuarioApp.repository.UsuarioRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.validation.BindingResult
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping

@Controller
class UsuarioController {

    @Autowired
    lateinit var repository: UsuarioRepository

    @GetMapping("/formulario/cadastro")
    fun openFormRegister(model: Model) : String {

        val usuario = Usuario()

        model.addAttribute("usuario", usuario)
        return "register"
    }


    @PostMapping("/cadastrar")
    fun registerUser( @Validated newUser: Usuario, result: BindingResult) : String {

        if (result.hasErrors()){
            println(result.allErrors)
            return "register"
        }

        repository.save(newUser)

        return "redirect:/home"
    }


    @GetMapping("home")
    fun openHome(model: Model): String {

        val usuarios = repository.findAll()

        model.addAttribute("usuarios", usuarios)

        return "home"
    }


    @GetMapping("/formulario/edicao/{id}")
    fun openFormEdit( @PathVariable("id") id : Long, model: Model) : String{

        val usuario = repository.findById(id).orElse(null)

        model.addAttribute("usuario", usuario)

        return "register-edit"
    }


    @PostMapping("/editar/{id}")
    fun userEdit(usuario: Usuario, @PathVariable("id") id: Long): String{

        usuario.id = id

        repository.save(usuario)

        return "redirect:/home"
    }


    @GetMapping("/remover/{id}")
    fun removeRegister (@PathVariable("id") id: Long) : String {

        repository.deleteById(id)

        return "redirect:/home"
    }

}