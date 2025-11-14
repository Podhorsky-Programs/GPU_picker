//sets up initial GPU choice, budget and Use before changes are made

//to make it easier, you can set up watchers to track the variables

var gpu;

var budget = getNumber("buget_DD");

var use = getText("use_DD");

var gpu_Output;

gpu_Update();

onEvent("buget_DD", "change", function( ) {

  //changes the budget option and updates GPU

  budget = getNumber("buget_DD");

  gpu_Update();

});

onEvent("use_DD", "change", function( ) {

  //changes the Use option but and updates GPU

  use = getText("use_DD");

  gpu_Update();

});

onEvent("gen_Button", "click", function( ) {

  //takes your budget and use and gives you a GPU based off that, the shows text to user

  update_Screen();

});

function update_Screen() {

  //updates the screen to show your GPU

  gpu_Output = "The GPU you should get is a " + gpu;

  setText("gpu_Output", gpu_Output);

}

function gpu_Update() {

  //changes the GPU based off budget and use

  if (budget == 3000) {

    gpu = "ROG Astral GeForce RTX 5090 OC edition";

  } else {

    if (budget == 1500 && use == "Gaming") {

      gpu = "GeForce RTX 5080";

    } else {

      if (budget == 1500 && use == "Streaming") {

        gpu = "MSI GeForce RTX 3090";

      } else {

        if (budget == 1500 && use == "Video Editing") {

          gpu = "Radeon RX 7900XT ultra";

        } else {

          if (budget == 1500 && use == "mix of the 3") {

            gpu = "MSI GeForce RTX 3090";

          } else {

            if (budget == 800 && use == "Gaming") {

              gpu = "GeForce RTX 3070 TI OC";

            } else {

              if (budget == 800 && use == "Streaming") {

                gpu = "Radeon RX 9070 XT Steel legend";

              } else {

                if (budget == 800 && use == "Video Editing") {

                  gpu = "Radeon RX 7900 XTX";

                } else {

                  if (budget == 800 && use == "mix of the 3") {

                    gpu = "GeForce RTX 3070 TI OC";

                  } else {

                    if (budget == 500 && use == "Gaming") {

                      gpu = "ROG GeForce RTX 4060 OC";

                    } else {

                      if (budget == 500 && use == "Streaming") {

                        gpu = "PNY GeForce RTX 5060 TI OC";

                      } else {

                        if (budget == 500 && use == "Video Editing") {

                          gpu = "Spectral White AMD Radeon RX 9060 XT";

                        } else {

                          if (budget == 500 && use == "mix of the 3") {

                            gpu = "Spectral White AMD Radeon RX 9060 XT";

                          } else {

                            if (budget == 300 && use == "Gaming") {

                              gpu = "MSI Gaming GeForce RTX 3060 12GB" ;

                            } else {

                              if (budget == 300 && use == "Streaming") {

                                gpu = "PNY GeForce RTX 5060 Epic-X";

                              } else {

                                if (budget == 300 && use == "Video Editing") {

                                  gpu = "ASRock Intel Arc B580";

                                } else {

                                  if (budget == 300 && use == "mix of the 3") {

                                    gpu = "PNY GeForce RTX 5060 Epic-X";

                                  }

                                }

                              }

                            }

                          }

                        }

                      }

                    }

                  }

                }

              }

            }

          }

        }

      }

    }

  }

}