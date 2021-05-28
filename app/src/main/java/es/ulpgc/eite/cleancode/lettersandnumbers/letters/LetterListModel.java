package es.ulpgc.eite.cleancode.lettersandnumbers.letters;

import android.util.Log;

import java.util.List;

import es.ulpgc.eite.cleancode.lettersandnumbers.data.LetterData;

public class LetterListModel implements LetterListContract.Model {

  public static String TAG = LetterListModel.class.getSimpleName();

  private String data;
  private int cuenta;

  public LetterListModel(String data) {
    this.data = data;
  }

  @Override
  public String getStoredData() {
    // Log.e(TAG, "getStoredData()");
    return data;
  }

  @Override
  public void onRestartScreen(String data) {
    // Log.e(TAG, "onRestartScreen()");
  }

  @Override
  public void onDataFromNextScreen(String data) {
    // Log.e(TAG, "onDataFromNextScreen()");
  }

  @Override
  public void onDataFromPreviousScreen(String data) {
    // Log.e(TAG, "onDataFromPreviousScreen()");
  }

  @Override
  public void addLetra() {
    LetterData letraNueva = new LetterData();
    if(cuenta == 0){
      letraNueva.letter = "A";
    }
    if(cuenta == 1){
      letraNueva.letter = "B";
    }
    if(cuenta == 2){
      letraNueva.letter = "C";
    }
    if(cuenta == 3){
      letraNueva.letter = "D";
    }
    if(cuenta == 4){
      letraNueva.letter = "E";
    }
    if(cuenta == 5){
      letraNueva.letter = "F";
    }
    data = letraNueva.getValue();
    cuenta++;
  }
}
