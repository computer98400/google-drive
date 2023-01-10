<template>

    <v-card outlined>
        <v-card-title>
            DashBoard # {{$route.params.id }}
        </v-card-title>

        <v-card-text>
            <div>
                <String label="Fileid" v-model="item.fileid" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="Filesize" v-model="item.filesize" :editMode="editMode" @change="change" />
            </div>
            <div>
                <Boolean label="Isindex" v-model="item.isindex" :editMode="editMode" @change="change" />
            </div>
            <div>
                <Boolean label="Uploaded" v-model="item.uploaded" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="Videourl" v-model="item.videourl" :editMode="editMode" @change="change" />
            </div>
            <div>
                <Date label="UploadDate" v-model="item.uploadDate" :editMode="editMode" @change="change" />
            </div>
        </v-card-text>
    </v-card>

</template>

<script>
  const axios = require('axios').default;

  export default {
    name: 'DashBoardViewDetail',
    props: {
      value: Object,
    },
    data: () => ({
        item : [],
    }),
    async created() {
      var params = this.$route.params;
      var temp = await axios.get(axios.fixUrl('/dashBoards/' + params.id))

      this.item = temp.data;

    },
    methods: {
    }
  }
</script>

