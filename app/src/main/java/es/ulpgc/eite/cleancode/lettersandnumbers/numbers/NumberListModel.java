package es.ulpgc.eite.cleancode.lettersandnumbers.numbers;

import es.ulpgc.eite.cleancode.lettersandnumbers.data.NumberData;

public class NumberListModel implements NumberListContract.Model {

  public static String TAG = NumberListModel.class.getSimpleName();

  private String data;
  private int cuenta;

  public NumberListModel(String data) {
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
  public void addNumbers() {

    NumberData numero = new NumberData();


    if(cuenta == 0){
      numero.number = 1;
    }
    if(cuenta == 1){
      numero.number = 2;
    }
    if(cuenta == 2){
      numero.number = 3;
    }
    if(cuenta == 3){
      numero.number = 4;
    }
    data = numero.getValue();
    cuenta++;


//    NumberData numero = new NumberData();
//    int nums = 1;
//    numero.number = nums;
//    data = numero.getValue();
//
//    int numAnt = Integer.parseInt(getStoredData());
//    numAnt++;
//    numero.number = numAnt;
//    data = numero.getValue();

  }
}
