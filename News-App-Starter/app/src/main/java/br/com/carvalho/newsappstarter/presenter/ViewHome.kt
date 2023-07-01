package br.com.carvalho.newsappstarter.presenter

import br.com.carvalho.newsappstarter.model.Article

interface ViewHome {

    interface View{
        fun showProgressBar()
        fun showFailure(message: String)
        fun hideProgressBar()
        fun showArticles(articles: List<Article>)
    }

    interface Favorite{
        fun showArticles(articles: List<Article>)
    }
}