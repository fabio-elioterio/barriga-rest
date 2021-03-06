package br.ce.fabio.rest.core;

import io.restassured.http.ContentType;

public interface Constantes {

    String URL_BASE = "https://barrigarest.wcaquino.me";
    Integer APP_PORT = 443; //Se fosse http seria 80
    String APP_BASE_PATH = "";

    ContentType APP_CONTENT_TYPE = ContentType.JSON;

    Long MAX_TIMEOUT = 5000L;
}
