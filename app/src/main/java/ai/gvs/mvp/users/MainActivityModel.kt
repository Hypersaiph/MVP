package ai.gvs.mvp.users

class MainActivityModel: UsersContract.Model {
    private var mCounter = 0

    override fun getCounter() = mCounter

    override fun incrementCounter() {
        mCounter++
    }

}