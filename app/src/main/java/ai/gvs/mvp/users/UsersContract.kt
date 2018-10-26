package ai.gvs.mvp.users

interface UsersContract {

    interface View {
        fun initView()
        fun updateViewData()
    }

    interface Presenter {
        fun incrementValue()
        fun getCounter(): String
    }

    interface Model {
        fun getCounter(): Int
        fun incrementCounter()
    }
}