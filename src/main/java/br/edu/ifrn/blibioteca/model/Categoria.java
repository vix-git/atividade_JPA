package br.edu.ifrn.blibioteca.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "categoria")
public class Categoria {

    @id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
}
