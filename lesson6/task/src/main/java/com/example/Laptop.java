package com.example;

import java.time.LocalDate;

public class Laptop {
  private String name;
  private String firma;
  private String processor;
  private int workingMemory;
  private int hardDiskMemory;
  private String operatingSystem;
  private String color;
  private boolean wifi;
  private boolean bluetooth;
  private LocalDate releaseDate;

  public Laptop(String name, String firma, String processor, int workingMemory, int hardDiskMemory, String string,
      String color,
      boolean wifi, boolean bluetooth, LocalDate releaseDate) {
    this.name = name;
    this.firma = firma;
    this.processor = processor;
    this.workingMemory = workingMemory;
    this.hardDiskMemory = hardDiskMemory;
    this.operatingSystem = operatingSystem;
    this.color = color;
    this.wifi = wifi;
    this.bluetooth = bluetooth;
    this.releaseDate = releaseDate;
  }

  public String getName() {
    return name;
  }

  public String getFirma() {
    return firma;
  }

  public String getProcessor() {
    return processor;
  }

  public int getWorkingMemory() {
    return workingMemory;
  }

  public int getHardDiskMemory() {
    return hardDiskMemory;
  }

  public String getOperatingSystem() {
    return operatingSystem;
  }

  public String getColor() {
    return color;
  }

  public boolean isWifi() {
    return wifi;
  }

  public boolean isBluetooth() {
    return bluetooth;
  }

  public LocalDate getReleaseDate() {
    return releaseDate;
  }

  @Override
  public String toString() {
    return "Laptop [name=" + name + ", firma=" + firma + ", processor=" + processor + ", workingMemory=" + workingMemory
        + ", hardDiskMemory="
        + hardDiskMemory + ", operatingSystem=" + operatingSystem + ", color=" + color + ", wifi=" + wifi
        + ", bluetooth=" + bluetooth + ", releaseDate=" + releaseDate + "]";
  }
}
