package br.com.carvalho.newsappstarter.presenter.search

import br.com.carvalho.newsappstarter.model.NewsResponse

interface SearchHome {

    interface Presenter {
        fun search(term: String)
        fun onSuccess(newsResponse: NewsResponse)
        fun onError(message: String)
        fun onComplete()
    }

}