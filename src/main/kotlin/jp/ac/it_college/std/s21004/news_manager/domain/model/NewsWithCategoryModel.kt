package jp.ac.it_college.std.s21004.news_manager.domain.model

data class NewsWIthCategoryModel(
    val news: NewsModel,
    val category: CategoryModel?
) {
    val isCategory: Boolean
        get() = category !=null
}