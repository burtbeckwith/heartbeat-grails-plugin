package fr.mos.eismo.plugin

import grails.converters.JSON

class HeartbeatController {

    def index() {
        def result = [version: meta([name:"app.version"])]
        render result as JSON
    }

}