package com.trianacodes.script.utah.Entidades;

public class Socios {

    private String nombre;
    private String nick;
    private String cargo;
    private int foto;

    public Socios(String nombre, String nick, String cargo, int foto) {
        this.nombre = nombre;
        this.nick = nick;
        this.cargo = cargo;
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

}
