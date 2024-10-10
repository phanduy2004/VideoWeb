package service;

import dao.CategoryDao;
import dao.interf.ICategoryDao;
import entity.Category;
import service.interf.ICategoryService;

import java.util.List;

public class CategoryService implements ICategoryService {
    ICategoryDao categoryDao= new CategoryDao();


    @Override
    public void DeleteCategory(Category category) throws Exception {
        categoryDao.DeleteCategory(category);
    }

    @Override
    public void updateCategory(Category category) {
        categoryDao.updateCategory(category);
    }

    @Override
    public void InsertCategory(Category category) {
        categoryDao.InsertCategory(category);
    }

    @Override
    public Category FindById(int id) {
        return categoryDao.FindById(id);
    }

    @Override
    public List<Category> FindAll() {
        return categoryDao.FindAll();
    }

    @Override
    public List<Category> findByCategoryname(String catname) {
        return categoryDao.findByCategoryname(catname);
    }

    @Override
    public List<Category> findAll(int page, int pagesize) {
        return categoryDao.findAll(page, pagesize);
    }

    @Override
    public int count() {
        return categoryDao.count();
    }
}
