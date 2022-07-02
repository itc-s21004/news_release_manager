package jp.ac.it_college.std.s21004.news_manager.domain.repository

import jp.ac.it_college.std.s21004.news_manager.domain.model.NewsWIthCategoryModel
import jp.ac.it_college.std.s21004.news_manager.infrastructure.database.record.News

interface NewsRepository {
    fun findAllWithCategory(): List<NewsWIthCategoryModel>

    fun findWithCategory(id: Long): NewsWIthCategoryModel?

    fun register(news: News)

}