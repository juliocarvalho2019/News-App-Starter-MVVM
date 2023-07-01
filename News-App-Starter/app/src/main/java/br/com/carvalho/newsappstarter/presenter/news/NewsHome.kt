package br.com.carvalho.newsappstarter.presenter.news

import br.com.carvalho.newsappstarter.model.NewsResponse

interface NewsHome {

    interface Presenter {
        fun requestAll()
        fun onSuccess(newsResponse: NewsResponse)
        fun onError(message: String)
        fun onComplete()
    }
}