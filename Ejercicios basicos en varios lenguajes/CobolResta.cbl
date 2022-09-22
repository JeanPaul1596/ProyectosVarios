      ******************************************************************
      * Author: Jean Paul Porras Carvajal.
      * Date:
      * Purpose:
      * Tectonics: cobc
      ******************************************************************
       IDENTIFICATION DIVISION.
           PROGRAM-ID. RESTA.
           DATA DIVISION.
           FILE SECTION.
           WORKING-STORAGE SECTION.
           01 NUM1 PIC 9(4).
           01 NUM2 PIC 9(4).
           01 RESULTADO PIC 9(5).
           PROCEDURE DIVISION.
           MAIN-PROCEDURE.
           DISPLAY "Introduce el primer numero: ".
	          ACCEPT NUM1.
	          DISPLAY "Introduce el segundo numero: ".
	          ACCEPT NUM2.
	          SUBTRACT NUM1 FROM NUM2 GIVING RESULTADO.
	          DISPLAY "El resultado es " RESULTADO.
	          STOP RUN.
           END PROGRAM RESTA.
