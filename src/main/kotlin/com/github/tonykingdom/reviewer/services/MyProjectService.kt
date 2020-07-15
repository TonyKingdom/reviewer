package com.github.tonykingdom.reviewer.services

import com.intellij.openapi.project.Project
import com.github.tonykingdom.reviewer.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
