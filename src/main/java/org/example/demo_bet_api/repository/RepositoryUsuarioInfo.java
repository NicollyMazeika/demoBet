package org.example.demo_bet_api.repository;

import org.example.demo_bet_api.model.UsuarioInfoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryUsuarioInfo extends JpaRepository<UsuarioInfoModel, Integer> {
}
