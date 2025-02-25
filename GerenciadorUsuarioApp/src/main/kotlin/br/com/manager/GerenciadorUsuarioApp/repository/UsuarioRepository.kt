package br.com.manager.GerenciadorUsuarioApp.repository

import br.com.manager.GerenciadorUsuarioApp.model.Usuario
import org.springframework.data.jpa.repository.JpaRepository

interface UsuarioRepository : JpaRepository< Usuario, Long >{
}