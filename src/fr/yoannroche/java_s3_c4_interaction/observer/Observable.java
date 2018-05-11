package fr.yoannroche.java_s3_c4_interaction.observer;



public interface Observable {
  public void addObservateur(Observateur obs);
  public void updateObservateur();
  public void delObservateur();
}