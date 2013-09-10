/* Copyright (C) 2011 [Gobierno de Espana]
 * This file is part of "Cliente @Firma".
 * "Cliente @Firma" is free software; you can redistribute it and/or modify it under the terms of:
 *   - the GNU General Public License as published by the Free Software Foundation;
 *     either version 2 of the License, or (at your option) any later version.
 *   - or The European Software License; either version 1.1 or (at your option) any later version.
 * Date: 11/01/11
 * You may contact the copyright holder at: soporte.afirma5@mpt.es
 */

package es.gob.afirma.core.ui;

import java.io.File;
import java.io.IOException;

/** Gestor de componentes de interfaz gr&aacute;fico
 * @version 0.4 */
public interface AOUIManager {

    /** Pregunta al usuario por una contrase&ntilde;a.
     * @param text Texto que se muestra en el di&aacute;logo para pedir la contrase&ntilde;a
     * @param c Componente padre (para la modalidad)
     * @return Contrase&ntilde;a introducida por el usuario
     * @throws es.gob.afirma.core.AOCancelledOperationException Cuando el usuario cancela el
     *         proceso de solicitud de contrase&ntilde;a */
    char[] getPassword(String text, Object c);

    /** Muestra un di&aacute;logo para pedir una contrase&ntilde;a al usuario.
     * @param text Texto con el que se solicitar&aacute; la entrada de texto al
     *        usuario (<i>prompt</i>)
     * @param charSet Juego de caracteres aceptados para la contrase&ntilde;a
     * @param beep <code>true</code> si se desea un sonido de advertencia al
     *             introducir un caracter no v&aacute;lido, <code>false</code> en caso contrario
     * @param c Componente padre (para la modalidad)
     * @return Array de caracteres del texto introducido como contrase&ntilde;a
     * @throws es.gob.afirma.core.AOCancelledOperationException
     *         Cuando el usuario cancela o cierra el di&aacute;logo */
    char[] getPassword(String text, final String charSet, final boolean beep, final Object c);

    /** JOptionPane.showInputDialog().
     * @param parentComponent Componente padre (se descarta si no es del tipo <code>java.awt.Component</code> en la implementaci&oacute;n Swing
     * @param message Mensaje
     * @param title Titulo del cuadro de di&aacute;logo
     * @param messageType Tipo de mensaje
     * @param icon Icono a mostrar en el di&aacute;logo
     * @param selectionValues Valores posibles para seleccionar
     * @param initialSelectionValue Valor seleccionado por defecto
     * @return Valor seleccionado */
    Object showInputDialog(Object parentComponent, Object message, String title, int messageType, Object icon, Object[] selectionValues, Object initialSelectionValue);

    /** Di&aacute;logo de selecci&oacute;n de certificados.
     * @param parentComponent Componente padre (se descarta si no es del tipo <code>java.awt.Component</code> en la implementaci&oacute;n Swing
     * @param selectionValues Listado de valores seleccionables de tipo Nombre-Certificado.
     * @return Valor seleccionado */
    Object showCertificateSelectionDialog(Object parentComponent, NameCertificateBean[] selectionValues);

    /** JOptionPane.showConfirmDialog().
     * @param parentComponent Componente padre (se descarta si no es del tipo <code>java.awt.Component</code> en la implementaci&oacute;n Swing
     * @param message Mensaje
     * @param title Titulo del cuadro de di&aacute;logo
     * @param optionType Tipo de opciones a confirmar
     * @param messageType Tipo de mensaje
     * @return Opci&oacute;n seleccionada */
    int showConfirmDialog(Object parentComponent, Object message, String title, int optionType, int messageType);

    /** JOptionPane.showMessageDialog().
     * @param parentComponent Componente padre (se descarta si no es del tipo <code>java.awt.Component</code> en la implementaci&oacute;n Swing
     * @param message Mensaje
     * @param title Titulo del cuadro de di&aacute;logo
     * @param messageType Tipo de mensaje */
    void showMessageDialog(Object parentComponent, Object message, String title, int messageType);

    /** Obtiene el c&oacute;digo equivalente a JOptionPane.PLAIN_MESSAGE en la implementaci&oacute;n del entorno operativo actual.
     * @return C&oacute;digo equivalente a JOptionPane.PLAIN_MESSAGE */
    int getPlainMessageCode();

    /** Obtiene el c&oacute;digo equivalente a JOptionPane.YES_NO_OPTION en la implementaci&oacute;n del entorno operativo actual.
     * @return C&oacute;digo equivalente a JOptionPane.YES_NO_OPTION */
    int getYesNoOptionCode();

    /** Obtiene el c&oacute;digo equivalente a JOptionPane.WARNING_MESSAGE en la implementaci&oacute;n del entorno operativo actual.
     * @return C&oacute;digo equivalente a JOptionPane.WARNING_MESSAGE */
    int getWarningMessageCode();

    /** Obtiene el c&oacute;digo equivalente a JOptionPane.ERROR_MESSAGE en la implementaci&oacute;n del entorno operativo actual.
     * @return C&oacute;digo equivalente a JOptionPane.ERROR_MESSAGE */
    int getErrorMessageCode();

    /** Obtiene el c&oacute;digo equivalente a JOptionPane.YES_OPTION en la implementaci&oacute;n del entorno operativo actual.
     * @return C&oacute;digo equivalente a JOptionPane.YES_OPTION */
    int getYesOptionCode();

    /** Obtiene el c&oacute;digo equivalente a JOptionPane.NO_OPTION en la implementaci&oacute;n del entorno operativo actual.
     * @return C&oacute;digo equivalente a JOptionPane.NO_OPTION */
    int getNoOptionCode();

    /** Obtiene el c&oacute;digo equivalente a JOptionPane.OK_CANCEL_OPTION en la implementaci&oacute;n del entorno operativo actual.
     * @return C&oacute;digo equivalente a JOptionPane.OK_CANCEL_OPTION */
    int getOkCancelOptionCode();

    /** Obtiene el c&oacute;digo equivalente a JOptionPane.OK_OPTION en la implementaci&oacute;n del entorno operativo actual.
     * @return C&oacute;digo equivalente a JOptionPane.OK_OPTION */
    int getOkOptionCode();

    /** Obtiene el c&oacute;digo equivalente a JOptionPane.INFORMATION_MESSAGE en la implementaci&oacute;n del entorno operativo actual.
     * @return C&oacute;digo equivalente a JOptionPane.INFORMATION_MESSAGE */
    int getInformationMessageCode();

    /** Obtiene el c&oacute;digo equivalente a JOptionPane.QUESTION_MESSAGE en la implementaci&oacute;n del entorno operativo actual.
     * @return C&oacute;digo equivalente a JOptionPane.QUESTION_MESSAGE */
    int getQuestionMessageCode();

    /** Pide al usuario que seleccione un fichero.
     * @param dialogTitle
     *        T&iacute;tulo de la ventana de di&aacute;logo.
     * @param currentDir Directorio inicial del di&aacute;logo
     * @param filename Nombre del fichero a localizar
     * @param extensions Extensiones predeterminadas para el fichero
     * @param description Descripci&oacute;n del tipo de fichero correspondiente con las extensiones
     * @param selectDirectory {@code true} para permitir la selecci&oacute;n de directorios, {@code true}
     * 					  para selecci&oacute;n de ficheros. En caso de directorios el par&aacute;metro
     * 					  {@code multiselect} se ignorar&aacute;.
     * @param multiSelect {@code true} para permitir selecci&oacute;n m&uacute;ltiple, {@code false}
     *                    para selecci&oacute;n de un &uacute;nico fichero
     * @param parentComponent
     *        Componente padre (para la modalidad)
     * @return Nombre de fichero (con ruta) seleccionado por el usuario */
    File[] getLoadFiles(String dialogTitle, String currentDir, String filename, String[] extensions, String description, boolean selectDirectory, boolean multiSelect, Object parentComponent);

    /** Muestra un di&aacute;logo de guardado para almacenar los datos indicados.
     * Los datos ser&aacute;n almacenados en el directorio y con el nombre que
     * indique el usuario. Si el fichero ya existe se le preguntar&aacute; al
     * usuario si desea sobreescribirlo. En caso de cancelar la operaci&oacute;n
     * se devolvera null, si la operaci&oacute;n finaliza correctamente se
     * devolver&aacute; el path completo del fichero.
     * @param data Datos que se desean almacenar.
     * @param currentDir Directorio inicial del di&aacute;logo
     * @param dialogTitle T&iacute;tulo del di&aacute;logo de guardado
     * @param selectedFile Nombre de fichero por defecto.
     * @param exts Extensiones de fichero aceptadas.
     * @param description Descripci&oacute;n del tipo de fichero a guardar.
     * @param parent Componente padre sobre el que se mostrar&aacute; el
     *        di&aacute;logo de guardado.
     * @return Fichero guardado.
     * @throws IOException Si no se puede guardar el fichero */
    File saveDataToFile(final byte[] data,
    					final String currentDir,
    					final String dialogTitle,
    		            final String selectedFile,
    		            final String[] exts,
    		            final String description,
    		            final Object parent) throws IOException;
}