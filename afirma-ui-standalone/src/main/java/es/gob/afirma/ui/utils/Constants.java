/*
 * Este fichero forma parte del Cliente @firma.
 * El Cliente @firma es un applet de libre distribucion cuyo codigo fuente puede ser consultado
 * y descargado desde www.ctt.map.es.
 * Copyright 2009,2010 Ministerio de la Presidencia, Gobierno de Espana
 * Este fichero se distribuye bajo licencia GPL version 3 segun las
 * condiciones que figuran en el fichero 'licence' que se acompana.  Si se   distribuyera este
 * fichero individualmente, deben incluirse aqui las condiciones expresadas alli.
 */
package es.gob.afirma.ui.utils;

import javax.swing.ImageIcon;

/**
 *	Constantes para contrase&ntilde;as
 */
public class Constants {

	/** Caracteres que pueden formar parte de una cadena de contrase&ntilde;a. */
    public static final String PASSWORD_VALID_CHARACTERS =
    	"ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890.,-@";
	
    /**
     * Width inicial de los JAccessibilityFrame de la aplicacion.
     */
    public static final int WINDOW_INITIAL_WIDTH = 650;
    
    /**
     * Height inicial de los JAccessibilityFrame de la aplicacion.
     */
    public static final int WINDOW_INITIAL_HEIGHT = 370;
    
    /**
     * Width inicial de la pantalla de seleccion de usuario
     */
    public static final int INIT_WINDOW_INITIAL_WIDTH = 530;
    
    /**
     * Height inicial de la pantalla de seleccion de usuario
     */
    public static final int INIT_WINDOW_INITIAL_HEIGHT = 375;
    
    /**
     * Width inicial de los JAccessibilityFrameAbout de la aplicacion
     */
    public static final int ABOUT_WINDOW_INITIAL_WIDTH = 450;
    
    /**
     * Height inicial de los JAccessibilityFrameAbout de la aplicacion
     */
    public static final int ABOUT_WINDOW_INITIAL_HEIGHT = 390;
    
    /**
     * Width inicial de los JAccessibilityFrameAbout de la aplicacion en LINUX.
     */
    public static final int ABOUT_WINDOW_INITIAL_WIDTH_LINUX = 490;
    
    /**
     * Height inicial de los JAccessibilityFrameAbout de la aplicacion en LINUX.
     */
    public static final int ABOUT_WINDOW_INITIAL_HEIGHT_LINUX = 430;
    
    /**
     * Width inicial de los JAccessibilityDialog de la aplicacion.
     */
    public static final int OPTION_INITIAL_WIDTH = 525;
    
    /**
     * Height inicial de los JAccessibilityDialog de la aplicacion.
     */
    public static final int OPTION_INITIAL_HEIGHT = 600;
    
    /**
     * Width inicial de los JAccessibilityDialog de la aplicacion con variacion de fuente.
     */
    public static final int OPTION_FONT_INITIAL_WIDTH = 650;
    
    /**
     * Height inicial de los JAccessibilityDialog de la aplicacion con variacion de fuente.
     */
    public static final int OPTION_FONT_INITIAL_HEIGHT = 655;
    
    /**
     * Width inicial de los JAccessibilityDialog de la aplicacion con variacion de fuente en LINUX.
     */
    public static final int OPTION_FONT_INITIAL_WIDTH_LINUX = 625;
    
    /**
     * Height inicial de los JAccessibilityDialog de la aplicacion con variacion de fuente en LINUX.
     */
    public static final int OPTION_FONT_INITIAL_HEIGHT_LINUX = 700;
    
    /**
     * Width inicial de los JAccessibilityDialogWizard de la aplicacion.
     */
    public static final int WIZARD_INITIAL_WIDTH = 670;
    
    /**
     * Height inicial de los JAccessibilityDialogWizard de la aplicacion.
     */
    public static final int WIZARD_INITIAL_HEIGHT = 545;
    
    /**
     * Width inicial de los JAccessibilityDialogWizard de la aplicacion en LINUX.
     */
    public static final int WIZARD_INITIAL_WIDTH_LINUX = 700;
    
    /**
     * Height inicial de los JAccessibilityDialogWizard de la aplicacion en LINUX.
     */
    public static final int WIZARD_INITIAL_HEIGHT_LINUX = 495;
    
    /**
     * Width inicial de los JAccessibilityDialogWizard de la aplicacion con variación de fuente.
     */
    public static final int WIZARD_FONT_INITIAL_WIDTH = 750;
    
    /**
     * Height inicial de los JAccessibilityDialogWizard de la aplicacion con variación de fuente.
     */
    public static final int WIZARD_FONT_INITIAL_HEIGHT = 625;
    
    /**
     * Width inicial de los JAccessibilityDialogWizard de la aplicacion con variación de fuente en LINUX.
     */
    public static final int WIZARD_FONT_INITIAL_WIDTH_LINUX = 780;
    
    /**
     * Height inicial de los JAccessibilityDialogWizard de la aplicacion con variación de fuente en LINUX.
     */
    public static final int WIZARD_FONT_INITIAL_HEIGHT_LINUX = 545;
    
    /**
     * Width inicial de los JAccessibilityFileChooser de la aplicacion.
     */
    public static final int FILE_INITIAL_WIDTH = 600;
    
    /**
     * Height inicial de los JAccessibilityFileChooser de la aplicacion.
     */
    public static final int FILE_INITIAL_HEIGHT = 300;
    
    /**
     * Width inicial de los JAccessibilityCustomDialog de la aplicacion.
     */
    public static final int CUSTOMDIALOG_INITIAL_WIDTH = 505;
    
    /**
     * Height inicial de los JAccessibilityCustomDialog de la aplicacion.
     */
    public static final int CUSTOMDIALOG_INITIAL_HEIGHT = 210;
    
    /**
     * Width inicial de los JAccessibilityCustomDialog de la aplicacion.
     */
    public static final int CUSTOMDIALOG_FONT_INITIAL_WIDTH = 555;
    
    /**
     * Height inicial de los JAccessibilityCustomDialog de la aplicacion.
     */
    public static final int CUSTOMDIALOG_FONT_INITIAL_HEIGHT = 250;
    
    /**
     * Width de maximizado de los JAccessibilityCustomDialog de la aplicacion.
     */
    public static final int CUSTOMDIALOG_MAX_WIDTH = 755;
    
    /**
     * Height de maximizado de los JAccessibilityCustomDialog de la aplicacion.
     */
    public static final int CUSTOMDIALOG_MAX_HEIGHT = 400;
    
    /**
     * Factor de redimensionado para las imagenes    
     */
    public static final double RESIZING_IMAGES_FACTOR = 0.0015;
    
    /**
     * Nombre del nodo en el que se guardan las Preferences
     */
    public static String ourNodeName = "es.gob.afirma";
    
    /**
     * Nombre del usuario por defecto
     */
    public static String defaultUser = "Por defecto";
    
    /**
     * Margen a restar para calcular el tamaño de una ventana maximizada para linux.
     */
    public static int maximizeVerticalMarginLinux = 52;
    
	 /**
	 * Variable que almacena el icono original del botón de maximizar.
	 */
	public static final ImageIcon IMAGEICONMAXIMIZE = new ImageIcon(Utils.class.getResource("/resources/images/maximize.png"));
	
	 /**
	 * Variable que almacena el icono original del botón de restaurar.
	 */
	public static final ImageIcon IMAGEICONRESTORE = new ImageIcon(Utils.class.getResource("/resources/images/restore.png"));
}

