package com.illareklab.demodata.data.remote

object NetworkConstants {
    /**
     * URL base para los endpoints de la API.
     * Descomenta la que desees utilizar.
     */
    //const val BASE_URL = "http://192.168.1.38:8000/"
    const val BASE_URL = "https://platform-api.kankunapaq.com/"
    // const val BASE_URL = "http://illarek.org/"

    /**
     * Slug del proyecto (tenant) para las peticiones multi-tenant.
     */
    const val PROJECT_SLUG = "layout_example" // Cambiar según el proyecto
}
