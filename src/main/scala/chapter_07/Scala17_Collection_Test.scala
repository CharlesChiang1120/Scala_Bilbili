package chapter_07

object Scala17_Collection_Test {
  def main(args: Array[String]): Unit = {

    // TODO 集合
    // 不同省份的商品點擊排行

    val list = List(
      ("zhangsan", "河北", "鞋"),
      ("lisi", "河南", "帽子"),
      ("wangwu", "河北", "衣服"),
      ("zhangsan", "河南", "帽子"),
      ("lisi", "河北", "鞋"),
      ("wangwu", "河南", "帽子"),
      ("zhangsan", "河北", "衣服"),
      ("lisi", "河北", "帽子"),
      ("wangwu", "河南", "鞋"),
      ("zhangsan", "河南", "鞋"),
      ("wangwu", "河北", "帽子"),
      ("lisi", "河南", "衣服"),
      ("wangwu", "河南", "衣服"),
      ("lisi", "河北", "衣服"),
      ("zhangsan", "河北", "帽子"),
      ("wangwu", "河北", "鞋"),
      ("zhangsan", "河南", "衣服"),
      ("lisi", "河南", "鞋"),
      ("zhangsan", "河北", "鞋"),
      ("lisi", "河北", "帽子"),
      ("wangwu", "河北", "衣服"),
      ("zhangsan", "河南", "帽子"),
      ("lisi", "河北", "鞋"),
      ("wangwu", "河南", "帽子"),
      ("zhangsan", "河北", "衣服"),
      ("lisi", "河北", "帽子"),
      ("wangwu", "河南", "鞋"),
      ("zhangsan", "河南", "鞋"),
      ("wangwu", "河北", "帽子"),
      ("lisi", "河南", "衣服"),
      ("wangwu", "河南", "衣服"),
      ("lisi", "河北", "衣服"),
      ("zhangsan", "河北", "帽子"),
      ("wangwu", "河北", "鞋"),
      ("zhangsan", "河南", "衣服"),
      ("lisi", "河南", "鞋"),
      ("wangwu", "河北", "帽子"),
      ("zhangsan", "河北", "鞋"),
      ("lisi", "河北", "帽子"),
      ("wangwu", "河北", "衣服"),
      ("zhangsan", "河南", "帽子"),
      ("lisi", "河北", "鞋"),
      ("wangwu", "河南", "帽子"),
      ("zhangsan", "河北", "衣服"),
      ("lisi", "河北", "帽子"),
      ("wangwu", "河南", "鞋"),
      ("zhangsan", "河南", "鞋"),
      ("wangwu", "河北", "帽子"),
      ("lisi", "河南", "衣服"),
      ("wangwu", "河南", "衣服"),
      ("lisi", "河北", "衣服"),
      ("zhangsan", "河北", "帽子"),
      ("wangwu", "河北", "鞋"),
      ("zhangsan", "河南", "衣服"),
      ("lisi", "河南", "鞋"),
      ("wangwu", "河北", "帽子"),
      ("zhangsan", "河北", "鞋"),
      ("lisi", "河北", "帽子"),
      ("wangwu", "河北", "衣服"),
      ("zhangsan", "河南", "帽子"),
      ("lisi", "河北", "鞋"),
      ("wangwu", "河南", "帽子"),
      ("zhangsan", "河北", "衣服"),
      ("lisi", "河北", "帽子"),
      ("wangwu", "河南", "鞋"),
      ("zhangsan", "河南", "鞋"),
      ("wangwu", "河北", "帽子"),
      ("lisi", "河南", "衣服"),
      ("wangwu", "河南", "衣服"),
      ("lisi", "河北", "衣服"),
      ("zhangsan", "河北", "帽子"),
      ("wangwu", "河北", "鞋"),
      ("zhangsan", "河南", "衣服"),
      ("lisi", "河南", "鞋"),
      ("zhangsan", "河北", "帽子"),
      ("zhangsan", "河南", "帽子"),
      ("lisi", "河北", "鞋")
    )


    // 1. 將數據按照省份進行分組
    // 河北, 河南
    val prvGroup: Map[String, List[(String, String, String)]] = list.groupBy(
      t => {t._2}
    )

    // 2. 在同一個省份中，將商品(Word)的點擊數量(Count)統計一下
    val result = prvGroup.mapValues(
      list => {
        // 2.1 獲取商品的數據
        val itemList = list.map(
          t => {
            t._3
          }
        )
        // 2.2 將相同的商品進行分組
        val itemGroupMap: Map[String, List[String]] = itemList.groupBy(item => item)

        // 2.3 獲取分組後的商品數量
        val itemCountMap: Map[String, Int] = itemGroupMap.mapValues(list => list.size).toMap

        // 2.4 將統計後的結果進行排序
        itemCountMap.toList.sortBy(_._2)(Ordering.Int.reverse)
      }
    ).toMap

    // Map(河南 -> List((鞋,12), (衣服,12), (帽子,10)), 河北 -> List((帽子,18), (鞋,13), (衣服,12)))
    println(result)

  }
}