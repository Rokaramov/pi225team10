pipeline {
    agent any
    parameters {
        booleanParam description: 'Нужно ли выполнить деплой на сервер TomCat (инфопроект.рф)?', name: 'Deploy'
        string defaultValue: 'project', description: 'Указание конкретного значения "Context Path" для выполнения деплоя.', name: 'Name', trim: true
    }
    stages {
        stage('Подготовка') {
            steps {
                echo 'Выполняем команды для подготовки'
                git changelog: false, poll: false, url: 'https://github.com/Rokaramov/pi225team10.git'
                sh "mvn clean"
                echo "Выполнили подготовку сборки № ${env.BUILD_ID} на ${env.JENKINS_URL}"
            }
        }
        stage('Сборка') {
            steps {
                echo 'Выполняем команды для сборки'
                sh "mvn package"
            }
        }
        stage('Развёртывание') {
            steps {
                echo 'Переносим код в рабочую среду или создае артефакт'
                script {
                    if ("${params.Deploy}"=="true") {
                        deploy adapters: [tomcat9(credentialsId: 'd7a6a324-46af-43da-a015-5fc459e50179', path: '', url: 'http://xn--e1afhkfagivn.xn--p1ai:8081/')], contextPath: "${params.Name}", war: '**/*.war'
                    }
                }
            }
        }
    }
}
