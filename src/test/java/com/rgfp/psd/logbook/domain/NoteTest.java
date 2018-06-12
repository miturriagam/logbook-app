package com.rgfp.psd.logbook.domain;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NoteTest {

    @Test
    public void itShouldCut20Char(){
        // Arrange
        String miTexto = "tiene 20 caracteres.";
        Note nota = new Note();
        // Act
        nota.setContent(miTexto);
        // Assert
        assertEquals (20, nota.getSummary().length());
    }


}