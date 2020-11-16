<template>
    <div class="inputBox shadow">
        <input type="text" placeholder="Type what you have to do"
               v-model="todo" @keyup.enter="reg">
        <span class="addContainer" @click="reg">
            <font-awesome-icon class="addBtn" icon="plus"/>
        </span>
    </div>
</template>
<script>
export default {
    data(){
        return {
            todo: ''
        }
    },
    methods:{
        reg(){
            if(this.todo == ''){
                alert('내용을 입력해주세요');
                return;
            }
            //이벤트를 등록한다고 생각
            this.$emit('sendTodo', this.todo);
            this.todo = '';
        }
    }
}
</script>
<style scoped>
input:focus{
    outline: none;
}
.inputBox{
    background-color: white;
    height: 50px;
    line-height: 50px;
    border-radius: 5px;
}
.inputBox input{
    border-style: none;
    font-size: 0.9rem;
}
.addContainer{
    float: right;
    background: linear-gradient(to right, #6478FB, #8763FB);
    display: block;
    width: 3rem;
    border-radius: 0 5px 5px 0;
}
.addBtn{
    color: white;
}
</style>