package com.company.inventory.infraestructure.conf;

public class Constants {

    public static final String RESPONSE_ERROR_MESSAGE_KEY = "error";
    public static final String NO_DATA_FOUND = "No se encontro ningun registro con ese codigo";
    public static final String NO_DATA_DELETE = "No se elimino";
    public static final String NO_DATA_SAVE = "No se Guardo";
    public static final String NO_DATA_EDIT = "No se Edito";

    private Constants() {
        throw new IllegalStateException("Utility class");
    }

    public static final String SWAGGER_TITLE_MESSAGE = "MicroServicio Inventory";
    public static final String SWAGGER_DESCRIPTION_MESSAGE =
            "Micro servicio, Inventory.";
    public static final String SWAGGER_VERSION_MESSAGE = "1.0.0";
    public static final String SWAGGER_LICENSE_NAME_MESSAGE = "Apache 2.0";
    public static final String SWAGGER_LICENSE_URL_MESSAGE = "http://springdoc.org";
    public static final String SWAGGER_TERMS_OF_SERVICE_MESSAGE = "http://swagger.io/terms/";
    public static final String RESPONSE_MESSAGE_KEY = "message";
    public static final String MENSAGGE = "Respuesta";
}
