package observer.weatherstation.observer

interface Observer {
    fun update(subject: Subject)
}