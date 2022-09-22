      ******************************************************************
      * Author: Jean Paul Porras Carvajal.
      * Date:
      * Purpose:
      * Tectonics: cobc
      ******************************************************************
       IDENTIFICATION DIVISION.
       PROGRAM-ID. CALCULOS.
       ENVIRONMENT DIVISION.
       DATA DIVISION.

       WORKING-STORAGE SECTION.
       01 NUM1 PIC 9(4).
       01 NUM2 PIC 9(4).
       01 RESULTADOS PIC 9(5).
       01 OPCION PIC 9(2).

       PROCEDURE DIVISION.
       MAIN-PROCEDURE.
           DISPLAY "Escoja una opcion: 1.Sumar 2.Restar".
           ACCEPT OPCION.
           DISPLAY "Introduzca un numero".
           ACCEPT NUM1
           DISPLAY "Introduzca un numero".
           ACCEPT NUM2
           IF OPCION = 1 THEN
               ADD NUM1 TO NUM2 GIVING RESULTADOS

               DISPLAY 'El resultado es: ' RESULTADOS
           ELSE
               SUBTRACT NUM1 FROM NUM2 GIVING RESULTADOS
               DISPLAY 'El resultado es: ' RESULTADOS
           END-IF.

       END PROGRAM CALCULOS.
