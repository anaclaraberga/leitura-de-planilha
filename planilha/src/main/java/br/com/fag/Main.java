package br.com.fag;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{

        System.out.println("hello");

        GerenciadorApostas sut = new GerenciadorApostas();
        sut.criar();
    }
}