package DST;

/**
 * This is Map class
 * methods:
 *   - Положить по ключу значение:              public void put(Object key, Object value);
 *   - Получить по ключу:                       public Object get(Object key);
 *   - Получить по ключу,                       public Object get(Object key, Object bydefault);
 *          если значение null, тогда надо вернуть значение по умолчанию, которое
 *          задается вторым параметром. Значение по умолчанию необходимо сохранить.
 *
 *   - Удалить по ключу, возвращает текущее     public Object remove(Object key);
 *     значение
 *   - Проверить наличие ключа:                 public boolean keyContains(Object key);
 *   - Получить список ключей:                  public List getKeys();
 *   - Получить список значений:                public List getValues();
 *   - Получить список пар: ключ, значение:     public List getEntries();
 *   - Размер словаря:                          public int size();
 *   - Пустой или нет:                          public boolean isEmpty();
 */
public class Map {
    private class Pair {
        int index;
        Object obj;
        Map.Pair next = null;

        public Pair(Object obj, int index) {
            this.obj = obj;
            this.index = index;
        }
    }
}
