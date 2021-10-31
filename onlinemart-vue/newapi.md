#### 2.3.1 searchGoods

**接口说明**

搜索商品

**请求方式**

GET

**URL**

```
/api/mall/goods/searchGoods
```

**请求参数**

| 参数名  | 参数类型 | 是否必须 | 说明   |
| ------- | -------- | -------- | ------ |
| keyword | str      | 必须     | 关键字 |

```json
{
    "keyword":"phone"
}
```

**返回参数**

| 参数名 | 参数类型 | 是否必须 | 说明     |
| ------ | -------- | -------- | -------- |
| code   | integer  | 必须     | 状态码   |
| data   | list     | 必须     | 商品列表 |

```json
{
	"code": 0,
	"data": [{
		"id": 546,
		"img": "http://115.29.141.32:8084/static/image/1618838668103gaitubao_2_jpg.jpg",
		"name": "iphone 12",
		"price": 7699.0,
	}]
}
```

### 1.1 getFavList

**接口说明**

获得用户的收藏列表

**请求方式**

GET

**URL**

```
/api/mall/order/getFavList
```

**请求参数**

| 参数名 | 参数类型 | 是否必须 | 说明     |
| ------ | -------- | -------- | -------- |
| username  | str      | 必须     | 用户名 |

```json
{
    "username":"user1"
}
```

**返回参数**

| 参数名 | 参数类型 | 是否必须 | 说明     |
| ------ | -------- | -------- | -------- |
| code   | integer  | 必须     | 状态码   |
| data   | list     | 必须     | 收藏列表 |

```json
{
	"code": 0,
	"data": [{
        "goodsId": 1,
        "img": "http://115.29.141.32:8084/static/image/16188185954412.jpg",
        "name": "西服套装的",
        "price": 500.0
	}, {
        "goodsId": 2,
        "img": "http://115.29.141.32:8084/static/image/161sd54412.jpg",
        "name": "水杯",
        "price": 50.0
	}]
}
```

### 1.3 addToFav

**接口说明**

收藏商品

**请求方式**

POST

**URL**

```
/api/mall/order/addToFav
```

**请求参数**

| 参数名 | 参数类型 | 是否必须 | 说明     |
| ------ | -------- | -------- | -------- |
| username| str    | 必须     | 用户名 |
| goodsId | integer  | 必须     | 商品id |

```json
{
    "username":"user1",
    "goodsId":1
}
```

**返回参数**

| 参数名 | 参数类型 | 是否必须 | 说明     |
| ------ | -------- | -------- | -------- |
| code   | integer  | 必须     | 状态码   |
| message | str      | 非必须   | 错误信息 |

```json
{
	"code": 0
}
```
### 1.2 deleteItemFromFav

**接口说明**

删除收藏的商品

**请求方式**

POST

**URL**

```
/api/mall/order/deleteItemFromFav
```

**请求参数**

| 参数名 | 参数类型 | 是否必须 | 说明     |
| ------ | -------- | -------- | -------- |
| username  | str      | 必须     | 用户昵称 |
| goodsId | integer  | 必须     | 商品id |

```json
{
    "username":"ser1",
    "goodsId":1
}
```

**返回参数**

| 参数名 | 参数类型 | 是否必须 | 说明     |
| ------ | -------- | -------- | -------- |
| code   | integer  | 必须     | 状态码   |
| message | str      | 非必须   | 错误信息 |

```json
{
	"code": 0
}
```



### 1.3 addToCart

**接口说明**

添加到购物车

**请求方式**

POST

**URL**

```
/api/mall/order/addToCart
```

**请求参数**

| 参数名 | 参数类型 | 是否必须 | 说明     |
| ------ | -------- | -------- | -------- |
| username| str    | 必须     | 用户名 |
| goodsId | integer  | 必须     | 商品id |
| num | integer  | 必须     | 商品数量 |

```json
{
    "username":"user1",
    "goodsId":1,
	"num":1
}
```

**返回参数**

| 参数名 | 参数类型 | 是否必须 | 说明     |
| ------ | -------- | -------- | -------- |
| code   | integer  | 必须     | 状态码   |
| message | str      | 非必须   | 错误信息 |

```json
{
	"code": 0
}
```

### 2.1 getCartList

**接口说明**

获得用户的购物车列表

**请求方式**

GET

**URL**

```
/api/mall/order/getCartList
```

**请求参数**

| 参数名 | 参数类型 | 是否必须 | 说明     |
| ------ | -------- | -------- | -------- |
| token  | str      | 必须     | 用户昵称 |

```json
{
    "token":"t"
}
```

**返回参数**

| 参数名 | 参数类型 | 是否必须 | 说明     |
| ------ | -------- | -------- | -------- |
| code   | integer  | 必须     | 状态码   |
| data   | list     | 必须     | 购物车列表 |

```json
{
	"code": 0,
	"data": [
		{
			"goodsId": 1,
			"img": "http://115.29.141.32:8084/static/image/16188185954412.jpg",
			"name": "phone1",
			"price": 500.0,
			"num": 1
		},
		{
			"goodsId": 2,
			"img": "http://115.29.141.32:8084/static/image/16188185954412.jpg",
			"name": "phone2",
			"price": 500.0,
			"num": 2
		}
	]
}
```

### 2.2 deleteItemFromCart

**接口说明**

删除收藏的商品

**请求方式**

POST

**URL**

```
/api/mall/order/deleteItemFromCart
```

**请求参数**

| 参数名 | 参数类型 | 是否必须 | 说明     |
| ------ | -------- | -------- | -------- |
| username  | str      | 必须     | 用户昵称 |
| index | integer  | 必须     | 商品在购物车中的下标序号 |

```json
{
    "username":"user1",
    "index":1
}
```

**返回参数**

| 参数名 | 参数类型 | 是否必须 | 说明     |
| ------ | -------- | -------- | -------- |
| code   | integer  | 必须     | 状态码   |
| message | str      | 非必须   | 错误信息 |

```json
{
	"code": 0
}
```

### 2.3 changeItemNumInCart

**接口说明**

改变购物车商品数量

**请求方式**

POST

**URL**

```
/api/mall/order/changeItemNumInCart
```

**请求参数**

| 参数名 | 参数类型 | 是否必须 | 说明     |
| ------ | -------- | -------- | -------- |
| username  | str      | 必须     | 用户昵称 |
| index | integer  | 必须     | 商品在购物车中的下标序号 |
| num | integer  | 必须     | 新的商品数量 |

```json
{
    "username":"username",
    "index":1,
    "num":10
}
```

**返回参数**

| 参数名 | 参数类型 | 是否必须 | 说明     |
| ------ | -------- | -------- | -------- |
| code   | integer  | 必须     | 状态码   |
| message | str      | 非必须   | 错误信息，超出库存数量等 |

```json
{
	"code": 0
}
```