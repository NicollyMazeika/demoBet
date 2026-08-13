package org.example.demo_bet_api.repository;

import org.example.demo_bet_api.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
}
