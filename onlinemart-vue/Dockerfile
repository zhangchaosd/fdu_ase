# syntax=docker/dockerfile:1
FROM node:14-alpine as build-stage

WORKDIR /app

COPY package*.json  ./

# 先安装依赖
RUN npm install

# 拷贝源代码
COPY . .

# 编译生产环境代码
RUN npm run build

# 生产环境使用nginx部署
FROM nginx:stable-alpine as production-stage
COPY --from=build-stage /app/dist /usr/share/nginx/html
CMD ["nginx", "-g", "daemon off;"]