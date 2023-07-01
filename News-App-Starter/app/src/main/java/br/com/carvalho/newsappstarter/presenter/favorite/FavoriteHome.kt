package br.com.carvalho.newsappstarter.presenter.favorite

import br.com.carvalho.newsappstarter.model.Article

interface FavoriteHome {

    interface Presenter {

        fun onSuccess(articles: List<Article>)
    }
}