package ai.gvs.mvp.users

class UsersPresenter(_view: UsersContract.View) : UsersContract.Presenter {

    private var view: UsersContract.View = _view
    private var model: UsersContract.Model = MainActivityModel()

    init {
        view.initView()
    }

    override fun incrementValue() {
        model.incrementCounter()
        view.updateViewData()
    }

    override fun getCounter() = model.getCounter().toString()
}
