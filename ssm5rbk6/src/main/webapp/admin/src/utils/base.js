const base = {
    get() {
        return {
            url : "http://localhost:8080/ssm5rbk6/",
            name: "ssm5rbk6",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm5rbk6/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "搬家预约系统"
        } 
    }
}
export default base
