The aim of this project is to create a Processing / Java emulator that is able to run on 

  * A Raspberry Pi image setup for JavaFX rendering directly to the frame buffer and including the source code for,
  * A JavaFX application that showcases games made by Macquarie University Students in CS1/computing 101.  The Java application can be run on any computer for easy experimentation.

You will find a zip of the raspberry pi image in the downloads folder.  To get started with this project you should:

  * Make sure to install JDK 8 and Intellij IDEA to edit the code.
  * Download the [pi image](http://web.science.mq.edu.au/~mattr/mq_mini_console.zip) and [write it to an SD card](https://www.raspberrypi.org/documentation/installation/installing-images/)
  * Boot the pi, login (pi/raspberry) and navigate to the java project directory (`cd ~/mqm`).
  * Pull the latest version of the code (`git pull`)
  * Build and run the java code (`./compile_and_run`)
  * Run the benchmark test which logs the frame times to a file (`./run_benchmark`)

You can make changes to the project directly on the pi if you like command line editing or you can do development on any other machine.  The performance will differ and you might find some JavaFX features won't work on the pi, so you should regularly check the appliation on a real pi.

The project will work on any pi, from Pi 1 to PiZero but each will have different performance characteristics.  Documenting the performance of each hardware iteration is one of the open problems remaining in the project (one amongst many).

If you would like to contribute to the project, please check the issues page for things that need doing, we are trying to keep the barrier to entry as low as possible so you should find this a good place to start contributing to open-source software.
