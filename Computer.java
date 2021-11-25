/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis;

/**
 *
 * @author acer
 */
abstract class Computer {
    public String ipAddress;
    public int cpuClock, memory, storage;
    
    public abstract void getInfo();
}
