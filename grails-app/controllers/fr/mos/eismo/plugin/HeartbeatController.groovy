package fr.mos.eismo.plugin

import grails.converters.JSON
import grails.util.Metadata

class HeartbeatController {

    def index() {
        render([version: Metadata.current.getApplicationVersion()] as JSON)
    }
}
